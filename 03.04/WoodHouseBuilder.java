class WoodHouseBuilder extends HouseBuilder
{
    int numWalls = 6;
    int numWindows = 10;
    String windowMaterial = "Tempered glass";
    String WallMaterial = "Wood 4x6";
    String interiorWallMaterial = "Wood 2x4";
    String roofMaterial = "Metal";

    public WoodHouseBuilder()
    {
        this.builderName = "Wood House Builder";
        setHouseType(HouseType.WOOD);

    }

    public HouseBuilder addWalls()
    {
        for (int i = 0; i< 4; i++)
        {
           System.out.println("Nailing wood for wall made out of"+WallMaterial);
            house.addWall(new Wall(WallMaterial));
        }
        for (int i = 0 ;i< numWalls - 4; i++)
        {
            System.out.println("Nailing wood for interior wall made out of" + interiorWallMaterial);
            house.addWall(new InteriorWall(interiorWallMaterial));
        }
        return this;
    }

    public HouseBuilder addWindows()
    {
        for (int i = 0; i<numWindows; i++)
        {
            System.out.println("Adding Window made out of"+ windowMaterial);
            house.addWindow(new Window(windowMaterial));
        }
        return this;
    }

    public HouseBuilder addRoof()
    {
        house.addRoof(new Roof(roofMaterial));
        return this;
    }

    public House build()
    {
        System.out.println("Nail everything together");
        return house;
    }
}