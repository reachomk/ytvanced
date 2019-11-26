package defpackage;

/* renamed from: anjh */
public final class anjh implements Runnable {
    private final /* synthetic */ anjl a;
    private final /* synthetic */ amul b;
    private final /* synthetic */ int c;

    public anjh(anjl anjl, amul amul, int i) {
        this.a = anjl;
        this.b = amul;
        this.c = i;
    }

    public final void run() {
        anjl anjl = this.a;
        amul amul = this.b;
        int i = this.c;
        anjv[] anjvArr = anjl.d;
        anjv anjv = anjvArr[i];
        anjvArr[i] = null;
        for (i = anjl.e; i < amul.size(); i++) {
            if (((anhl) amul.get(i)).a(anjv)) {
                anjl.a();
                anjl.e = i + 1;
                return;
            }
        }
        anjl.e = amul.size();
    }
}
