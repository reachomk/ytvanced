package defpackage;

import android.view.View;

/* renamed from: lmk */
public final class lmk extends aqj {
    public final lui p;

    lmk(View view, lui lui) {
        super(view);
        lmn lmn = new lmn();
        ffs ffs = new ffs();
        this.p = lui;
    }

    /* Access modifiers changed, original: final */
    public final void a(lqz lqz) {
        this.p.a(lqz);
    }

    public final String toString() {
        String aqj = super.toString();
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.p);
        int length = String.valueOf(aqj).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 12) + valueOf.length()) + valueOf2.length());
        stringBuilder.append(aqj);
        stringBuilder.append(" view:");
        stringBuilder.append(valueOf);
        stringBuilder.append(" wpvc:");
        stringBuilder.append(valueOf2);
        return stringBuilder.toString();
    }
}
