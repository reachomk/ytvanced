package defpackage;

import java.util.List;

/* renamed from: kjh */
final /* synthetic */ class kjh implements kjj {
    private final kjf a;
    private final awyk b;

    kjh(kjf kjf, awyk awyk) {
        this.a = kjf;
        this.b = awyk;
    }

    public final void a(List list) {
        kjf kjf = this.a;
        awyk awyk = this.b;
        kjf.h.addAll(list);
        for (awxn awxn : list) {
            if (kjf.g.containsKey(awxn)) {
                kjf.e.remove(kjf.g.get(awxn));
                kjf.g.remove(awxn);
            }
        }
        if (kjf.e.size() == 0) {
            kjf.c.d(new zyg(awyk));
        } else {
            kjf.e.a();
        }
        kjf.b();
    }
}
