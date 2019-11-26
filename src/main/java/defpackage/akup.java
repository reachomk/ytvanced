package defpackage;

import java.util.TimerTask;

/* renamed from: akup */
final class akup extends TimerTask {
    public final /* synthetic */ ajtf a;
    public final /* synthetic */ akun b;
    private final /* synthetic */ Object c;

    akup(akun akun, Object obj, ajtf ajtf) {
        this.b = akun;
        this.c = obj;
        this.a = ajtf;
    }

    public final void run() {
        this.b.K.remove(this.c);
        this.b.D.execute(new akuo(this));
    }
}
