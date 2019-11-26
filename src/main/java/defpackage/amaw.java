package defpackage;

/* renamed from: amaw */
public final class amaw extends aamz {
    public amaw(aamd aamd, afpt afpt, atli atli) {
        super(aamd, afpt, "upload/register", atli);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        atli atli = (atli) c();
        xvd.a(((atlf) atli.instance).c);
        int a = atlh.a(((atlf) atli.instance).d);
        if (a == 0) {
            a = 2;
        }
        boolean z = true;
        if (a == 1) {
            z = false;
        }
        amqw.a(z);
    }
}
