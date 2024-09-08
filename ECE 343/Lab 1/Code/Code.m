%% Sample matlab
% This sample code is written based on lab 1 which is 
% mainly used as a guideline for lab 1 and future labs

%% Formatting
colordef white;
% Plot with default font size 16+
% Linewidth of 2 or 3
set(0,'defaultAxesFontName', 'Arial');
set(0,'defaultTextFontName', 'Arial');
set(0,'defaultAxesFontWeight', 'Bold');
set(0,'defaultTextFontWeight', 'Bold');
set(0, 'DefaultTextFontSize', 16) ;
set(0, 'DefaultAxesFontSize', 14) ;
set(0, 'DefaultLineLineWidth', 3.5) ;
set(0, 'DefaultStairLineWidth', 3.5) ;
set(0, 'DefaultAxesLineWidth', 2.5) ;
set(0, 'DefaultPatchLineWidth', 2) ;
set(0, 'DefaultAxesXGrid', 'on') ;
set(0, 'DefaultAxesYGrid', 'on') ;
set(0, 'DefaultAxesBox', 'on') ;
set(0, 'DefaultFigurePosition', [200 175 1000 600]);

%% Loading File
% modified the directory of the .txt file as needed
filename = '.\Lab1.2-330.txt';
opts = detectImportOptions(filename);
opts.VariableNames = {'Freq','Re','Im'};
opts.VariableTypes = {'double','double','double'};
opts.Delimiter = {',', '\t'};
data = readmatrix(filename,opts);



%% Plotting
% convert data into complex number for calculation
freq = data(:,1);
complex = data(:,2)+1i*data(:,3);

magvv = abs(complex);               % obtain mag of AC response in V/V
magdB = 20*log10(magvv);            % obtain mag of AC response in dB
phase = angle(complex)*180/pi;      % obtain phase of AC response in deg


alt_data = [freq, magvv, magdB, phase];

targets = [1/sqrt(2) * magvv(1)];
closestRows = zeros(length(targets), size(alt_data, 2));

% find certain frequency
% for index = 1:length(targets)
%     target = targets(index);
%     differences = abs(alt_data(:, 1) - target);
%     [~, j] = min(differences);
% 
%     closestRows(index, :) = alt_data(j, :);
% end

% find certain magnitude
for index = 1:length(targets)
    target = targets(index);
    differences = abs(alt_data(:, 2) - target);
    [~, j] = min(differences);

    closestRows(index, :) = alt_data(j, :);
end

closestRows

% plotting the required plots in 2 by 2 grid using subplot
subplot(2,2,1)
semilogx(freq,magdB)       % dB / dHz
xlabel('Freq (Hz)')
ylabel('Magnitude (dB)')

% fill your code here
% ...
% fill up your code to plot freq vs magdB
% and log freq vs phase
% type "help subplot" in command window if you are not familiar with
% subplot function in matlab
subplot(2,2,3)
semilogx(freq, phase)      % deg / dHz
xlabel('Freq (Hz)')
ylabel('Phase (Degree)')

subplot(2,2,2)
plot(freq, magdB)          % dB / Hz
xlabel('Freq (Hz)')
ylabel('Magnitude (dB)')

subplot(2,2,4)
semilogx(freq,magvv)       % V/V / dHz
xlabel('Freq (Hz)')
ylabel('Magnitude (V/V)')
