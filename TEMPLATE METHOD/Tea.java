namespace i01_1_TemplateMethod
{
    class Tea
    {
        public void prepareRecipe()
        {
            boilWater();
            steepTeaBag();
            pourInCup();
            addLemon();
        }

        private void addLemon()
        {
            Console.System.out.println("Adding lemon");
        }

        private void pourInCup()
        {
            Console.System.out.println("Pouring into cup");
        }

        private void steepTeaBag()
        {
            Console.System.out.println("Steeping the tea");
        }

        private void boilWater()
        {
            Console.System.out.println("Boiling water");
        }
    }
}
