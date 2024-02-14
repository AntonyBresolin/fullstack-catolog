import React from "react";
import Hero from "../components/Hero";
import LPSidebar from "../components/Sidebar/LPSidebar";
import NavbarCatalog from "../components/Navbar/NavbarCatalog";

const LandingPage = () => {
  return (
    <div className="flex w-full h-full">
      <LPSidebar />
      <div>
        <Hero />
        <NavbarCatalog />
      </div>
    </div>
  );
}

export default LandingPage;