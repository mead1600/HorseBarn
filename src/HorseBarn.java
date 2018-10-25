public class HorseBarn {
    private Horse[] spaces;
    private int position;

    public HorseBarn(Horse[] spaces)
    {
        this.spaces = spaces;
    }

    public String toString()
    {
        String horseBunch = "";
        for(int i = 0; i < this.spaces.length; i++)
        {
            horseBunch = horseBunch + " " + this.spaces[i];
        }
        return horseBunch;
    }

    public int findHorseSpace(String name)
    {
        int position = 0;
        for(int i = 0; i < this.spaces.length; i++)
        {
            if(this.spaces[i] != null && name.equals(this.spaces[i].getName()))
            {
                return i;
            }
        }
        return -1;
    }
    public void consolidate()
    {
        for(int i = 0; i < this.spaces.length; i++)
        {
            if(this.spaces[i] ==null)
            {
                for(int a = i+1; a < this.spaces.length; a++)
                {
                    this.spaces[i] = this.spaces[a];
                    this.spaces[a]=null;
                    a = this.spaces.length;
                }
            }
        }
    }
}
