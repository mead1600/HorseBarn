public class HorseBarn {
    private Horse[] spaces;

    public HorseBarn(Horse[] spaces)
    {
        this.spaces = spaces;
    }

    public int FindHorseSpace(String name)
    {
        for(int i = 0; i < this.spaces.length; i++)
        {
            if(this.spaces[i].equals(name))
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
            if(this.spaces[i].equals(null))
            {
                for(int a = 0; a + i < this.spaces.length; a++)
                {
                    this.spaces[a+i] = this.spaces[a+i+1];
                    this.spaces[this.spaces.length-1]=null;
                }
            }
        }
    }
}
