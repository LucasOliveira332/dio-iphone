package model;

import interfaces.InternetBrowser;
import interfaces.Telephone;

public class Iphone implements Telephone{
  private MusicPlayer musicPlayer = new MusicPlayer();
  private InternetBrowser internetBrowser = new Safari();

  public void call() {
    System.out.println("Ligou");
  }

  public void asnwer() {
    System.out.println("Atendeu");
  }

  public void openTab(){
    internetBrowser.displayPage();
  }

  public void openNewTab(){
    internetBrowser.openNewTab();
  }

  public void refreshPage(){
    internetBrowser.refreshPage();
  }

  public void playMusic(){
    musicPlayer.play();
  }

  public void pauseMusic(){
    musicPlayer.pause();
  }
}