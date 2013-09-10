package gunslinger.sim;

// The base class of a player
// Extends the base class to start your player
// See dumb/Player.java for an example
//
public abstract class Player
{
    private static int globalId = 0;
    
    // id of player
    public final int id;
    
    // constructor for base class
    public Player()
    {
        id = globalId++;
    }

    // name of group
    //
    public abstract String name();
    
    // Initialize the player
    //
    public abstract void init(int nplayers, int[] friends, int enemies[]);

    // Pick a target to shoot
    // Parameters:
    //  prevRound - an array of previous shoots, prevRound[i] is the player that player i shot
    //              -1 if player i did not shoot
    //  alive - an array of player's status, true if the player is still alive in this round
    // Return:
    //  int - the player id to shoot, return -1 if do not shoot anyone
    //
    public abstract int shoot(int[] prevRound, boolean[] alive);
}
