class Tool {
    private int strength;
    private char type;

    public Tool(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength){
        this.strength = strength;
    }
    public int getStrength(){
        return strength;
    }

    static class Scissors extends Tool{
        public Scissors(int s){
            super(s);
            super.setStrength(s);
            super.type = 's';
        }
        public boolean fight(Tool tool){
            double num = 1.0;
            if(tool.getClass() == Paper.class)
                num *= 2;
            if(tool.getClass() == Rock.class)
                num /= 2;
            return num * this.getStrength() > tool.getStrength();
        }
    }

    static class Paper extends Tool{
        public Paper(int p){
            super(p);
            super.setStrength(p);
            super.type = 'p';
        }
        public boolean fight(Tool tool){
            double num = 1.0;
            if(tool.getClass() == Rock.class)
                num *= 2;
            if(tool.getClass() == Scissors.class)
                num /= 2;
            return num * this.getStrength() > tool.getStrength();
        }
    }

    static class Rock extends Tool{
        public Rock(int r){
            super(r);
            super.setStrength(r);
            super.type = 'r';
        }
        public boolean fight(Tool tool){
            double num = 1.0;
            if(tool.getClass() == Paper.class)
                num /= 2;
            if(tool.getClass() == Scissors.class)
                num *= 2;
            return num * this.getStrength() > tool.getStrength();
        }
    }



    public static class RockPaperScissorsGame{
        public static void main(String args[]){
            Scissors s = new Scissors(5);
            Paper p = new Paper(7);
            Rock r = new Rock(15);
            System.out.println(s.fight(p) + " , "+ p.fight(s) );
            System.out.println(p.fight(r) + " , "+ r.fight(p) );
            System.out.println(r.fight(s) + " , "+ s.fight(r) );
        }
    }
}
