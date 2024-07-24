package model;

import interfaces.InternetBrowser;

public class Safari implements InternetBrowser{

  public void displayPage() {
    System.out.println("Página aberta.");
  }

  public void openNewTab() {
    System.err.println("Nova página aberta.");
  }

  public void refreshPage() {
    System.err.println("Página Atualizada.");
  }
  
}
