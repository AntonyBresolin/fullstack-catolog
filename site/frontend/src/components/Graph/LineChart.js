import React from 'react';
import { Line } from 'react-chartjs-2';
import { Chart as ChartJS, CategoryScale, LinearScale, PointElement, LineElement, Title, Tooltip, Legend } from 'chart.js';

ChartJS.register(
  CategoryScale,
  LinearScale,
  PointElement,
  LineElement,
  Title,
  Tooltip,
  Legend
);

const LineChart = () => {
  const DATA_COUNT = 12;

  const labels = Array.from({ length: DATA_COUNT }, (_, i) => i.toString());
  const datapoints = [0, 20, 20, 60, 60, 120, 6, 180, 120, 125, 105, 110, 170];

  const data = {
    labels,
    datasets: [
      {
        label: 'Cubic interpolation (monotone)',
        data: datapoints,
        borderColor: 'black', // Example color
        fill: true, // Ajustado para 'origin'
        backgroundColor: 'red',
        cubicInterpolationMode: 'monotone',
        tension: 0.4
      }
    ]
  };

  const options = {
    responsive: true,
    plugins: {
      title: {
        display: true,
        text: 'Chart.js Line Chart - Cubic interpolation mode'
      },
    },
    interaction: {
      intersect: false,
    },
    scales: {
      x: {
        display: false,
        title: {
          display: true
        }
      },
      y: {
        display: false,
        title: {
          display: true,
          text: 'Value'
        },
        suggestedMin: -10,
        suggestedMax: 200
      }
    }
  };

  return <Line data={data} options={options} />;
};

export default LineChart;
