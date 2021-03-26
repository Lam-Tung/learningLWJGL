package org.brotato.game;

import org.brotato.engine.GameEngine;
import org.brotato.engine.IGameLogic;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            IGameLogic gameLogic = new DummyGame();
            GameEngine gameEngine = new GameEngine("GAME", 1280, 720, true, gameLogic);
            gameEngine.run();
        } catch (Exception excp) {
            excp.printStackTrace();
            System.exit(-1);
        }
    }
}
