package defpackage;

/* renamed from: jqa */
public final class jqa {
    public static final jqa b = new jqa(0);
    public int a;

    public jqa(int i) {
        int i2 = 0;
        if (i >= 0 && i <= 5) {
            i2 = i;
        }
        this.a = i2;
    }

    public final boolean a() {
        int i = this.a;
        return (i == -1 || i == 4 || i == 5) ? false : true;
    }

    public final boolean b() {
        int i = this.a;
        return i == -1 || i == 0 || i == 3;
    }

    public final void c() {
        this.a = !a() ? -1 : 0;
    }

    public final String toString() {
        switch (this.a) {
            case -2:
                return "HIDDEN_REVEAL_ON_ANY_PULL_ACTION";
            case -1:
                return "ALWAYS_SHOW_STICKY_SCROLL";
            case 0:
                return "ALWAYS_SHOW_SCROLL_WITH_TOOLBAR";
            case 1:
                return "REVEAL_AFTER_DELAY";
            case 2:
                return "DELAY_REVEAL_UNTIL_FIRST_PARTIAL_PULL";
            case 3:
                return "HIDE_AFTER_DELAY_THEN_REVEAL_ON_PULL_OR_PARTIAL_SCROLL";
            case 4:
                return "REVEAL_AFTER_DELAY_THEN_STICKY_SCROLL";
            case 5:
                return "HIDDEN_REVEAL_ON_ANY_PULL_OR_SCROLL_THEN_STICKY_SCROLL";
            default:
                return "UNKNOWN";
        }
    }
}
