package period.ldy.module;

/**
 * Created by ludeyuan on 16/7/27.
 * 日期的数据
 */
public class DateCardModule {
    public int date;
    public boolean isToday;
    public PeriodType type; //显示状态：1为月经期，2为预测期，3为安全期，4为易孕期, 0为其他
    public int isStart;//1表示开始，2表示结束，0表示其他
    public boolean istoMonth;//是否为当月的日期
    public DateCardModule(int date, boolean isToday, PeriodType type, int isStart, boolean istoMonth) {
        this.date = date;
        this.isToday = isToday;
        this.type = type;
        this.isStart = isStart;
        this.istoMonth = istoMonth;
    }
}
