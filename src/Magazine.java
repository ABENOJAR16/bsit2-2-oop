public class Magazine extends LibraryItem {
    private int issueNumber;
    private String publicationMonth;
    private boolean isLatestIssue;

    public Magazine(String itemId, String title, String author, int issueNumber, String publicationMonth, boolean isLatestIssue) {
        super(itemId, title, author);
        setIssueNumber(issueNumber);
        this.publicationMonth = publicationMonth;
        this.isLatestIssue = isLatestIssue;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public String getPublicationMonth() {
        return publicationMonth;
    }

    public boolean isLatestIssue() {
        return isLatestIssue;
    }

    public void setIssueNumber(int issueNumber) {
        if (issueNumber <= 0) {
            throw new IllegalArgumentException("Issue number must be positive.");
        }
        this.issueNumber = issueNumber;
    }

    @Override
    public String getItemType() {
        return "Magazine";
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 0.25;
    }

    @Override
    public void borrowItem(String borrowerName) {
        checkOut(borrowerName);
    }

    @Override
    public void returnItem() {
        checkIn();
    }

    @Override
    public int getBorrowingPeriod() {
        return 7; // Magazines can be borrowed for 7 days
    }
}
