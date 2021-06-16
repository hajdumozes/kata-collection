package sevenkyu.luckynumber;

class LuckyNumber {

    public boolean isLucky(long number) {
        long digitSum = String.valueOf(number).chars()
            .mapToLong(Character::getNumericValue)
            .sum();
        return digitSum % 9 == 0;
    }
}
