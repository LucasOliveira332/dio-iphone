package model;

import interfaces.MusicPlayerInterface;

public class MusicPlayer implements MusicPlayerInterface{

  public void play() {
    System.out.println("Musica iniciou.");
  }

  public void pause() {
    System.out.println("Musica Parou.");
  }

  @Override
  public void selectSong(String song) {
    System.out.printf("\nMusica selecionada" + song);
  }
  
}
