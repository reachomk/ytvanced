package defpackage;

/* renamed from: xcy */
public class xcy {
    private long a = -1;

    /* Access modifiers changed, original: protected */
    public void a(long j) {
        if (this.a == -1) {
            amqw.b(j >= 0);
            this.a = j;
            return;
        }
        throw new RuntimeException("This instance is already timestamped");
    }

    public final long a() {
        long j = this.a;
        if (j != -1) {
            return j;
        }
        throw new RuntimeException("TimestampedEvent not yet posted");
    }

    public final boolean b() {
        return this.a != -1;
    }
}
