import React from 'react';
import LineChart from './LineChart';

const GraphCatalog = () => {
  const data = [10, 20, 15, 30, 25, 35, 40];
  return (
    <div className=''>
      <LineChart data={data} width={600} height={400} />
    </div>
  );
};

export default GraphCatalog;