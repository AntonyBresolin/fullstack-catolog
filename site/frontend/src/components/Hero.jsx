import React from "react";

const Hero = () => {
  return (
    <div className="w-[80vw] h-80 flex items-center justify-center flex-col border-b-2 bg-slate-300 select-none">
      <h1 className="text-4xl font-semibold mb-4">Welcome to catalog</h1>
      <h2 className="text-xl font-light px-64 text-center">Esse catálogo foi criado por <strong>Antony Henrique Bresolin</strong> com o propósito de catalogar códigos e maximizar a velocidade de desenvolvimento.</h2>
    </div>
  );
}

export default Hero;