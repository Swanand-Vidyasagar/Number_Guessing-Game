class GetNum {
    private int randomNumber = (int) (Math.random() * 101);
    public boolean checkNum(int number) {
        if (number == randomNumber) {
            System.out.println("🎉 Congratulations! You guessed the correct number.");
            return true;
        } else if (number < randomNumber) {
            System.out.println("🔻 Too low! Try again.");
        } else {
            System.out.println("🔺 Too high! Try again.");
        }
        return false;
    }
}
