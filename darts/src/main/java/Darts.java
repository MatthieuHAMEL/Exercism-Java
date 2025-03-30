class Darts {
    int score(double xOfDart, double yOfDart) {
        double distFromOrigin = Math.sqrt(xOfDart*xOfDart + yOfDart*yOfDart);

        if (distFromOrigin <= 1.0) // Inner circle
            return 10; // 10 points!
        if (distFromOrigin <= 5.0) // Middle circle
            return 5;
        if (distFromOrigin <= 10.0) // Outer circle
            return 1;
        return 0;
    }
}
