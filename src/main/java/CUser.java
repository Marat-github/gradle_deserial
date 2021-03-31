import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CUser
{
    private String design_url;
    private int  transactions_total_amount;
    private int  tariff_avg_month_balance;
    private int type;
    private String closing_date;
    private int partial_withdraw_available;
    private int refill_available;
    private float blocked_amount;
    private String scheme_id;
    private String pan;
    private long account_id;
    private String title_small;
    private String title;
    private long balance;
    private String currency;
    private boolean isSalary;

    public CUser()
    {

    }

    public CUser(String design_url, int transactions_total_amount, int tariff_avg_month_balance, int type, String closing_date, int partial_withdraw_available, int refill_available, float blocked_amount, String scheme_id, String pan, long account_id, String title_small, String title, long balance, String currency, boolean isSalary) {
        this.design_url = design_url;
        this.transactions_total_amount = transactions_total_amount;
        this.tariff_avg_month_balance = tariff_avg_month_balance;
        this.type = type;
        this.closing_date = closing_date;
        this.partial_withdraw_available = partial_withdraw_available;
        this.refill_available = refill_available;
        this.blocked_amount = blocked_amount;
        this.scheme_id = scheme_id;
        this.pan = pan;
        this.account_id = account_id;
        this.title_small = title_small;
        this.title = title;
        this.balance = balance;
        this.currency = currency;
        this.isSalary = isSalary;
    }

    public String getDesign_url() {
        return design_url;
    }

    public void setDesign_url(String design_url) {
        this.design_url = design_url;
    }

    public int getTransactions_total_amount() {
        return transactions_total_amount;
    }

    public void setTransactions_total_amount(int transactions_total_amount) {
        this.transactions_total_amount = transactions_total_amount;
    }

    public int getTariff_avg_month_balance() {
        return tariff_avg_month_balance;
    }

    public void setTariff_avg_month_balance(int tariff_avg_month_balance) {
        this.tariff_avg_month_balance = tariff_avg_month_balance;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getClosing_date() {
        return closing_date;
    }

    public void setClosing_date(String closing_date) {
        this.closing_date = closing_date;
    }

    public int getPartial_withdraw_available() {
        return partial_withdraw_available;
    }

    public void setPartial_withdraw_available(int partial_withdraw_available) {
        this.partial_withdraw_available = partial_withdraw_available;
    }

    public int getRefill_available() {
        return refill_available;
    }

    public void setRefill_available(int refill_available) {
        this.refill_available = refill_available;
    }

    public float getBlocked_amount() {
        return blocked_amount;
    }

    public void setBlocked_amount(float blocked_amount) {
        this.blocked_amount = blocked_amount;
    }

    public String getScheme_id() {
        return scheme_id;
    }

    public void setScheme_id(String scheme_id) {
        this.scheme_id = scheme_id;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public long getAccount_id() {
        return account_id;
    }

    public void setAccount_id(long account_id) {
        this.account_id = account_id;
    }

    public String getTitle_small() {
        return title_small;
    }

    public void setTitle_small(String title_small) {
        this.title_small = title_small;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public boolean isSalary() {
        return isSalary;
    }

    public void setSalary(boolean salary) {
        isSalary = salary;
    }

    @Override
    public String toString() {
        return "CUsers{" +
                "design_url='" + design_url + '\'' +
                ", transactions_total_amount=" + transactions_total_amount +
                ", tariff_avg_month_balance=" + tariff_avg_month_balance +
                ", type=" + type +
                ", closing_date='" + closing_date + '\'' +
                ", partial_withdraw_available=" + partial_withdraw_available +
                ", refill_available=" + refill_available +
                ", blocked_amount=" + blocked_amount +
                ", scheme_id='" + scheme_id + '\'' +
                ", pan='" + pan + '\'' +
                ", account_id=" + account_id +
                ", title_small='" + title_small + '\'' +
                ", title='" + title + '\'' +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                ", isSalary=" + isSalary +
                '}';
    }
}
