package defpackage;

import android.text.TextUtils;

/* renamed from: abjr */
public final class abjr extends aaml {
    public String a;
    public String b;

    public abjr(aamd aamd, afpt afpt) {
        super("updated_metadata", aamd, afpt);
        a(zzp.b);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        if (!TextUtils.isEmpty(this.b)) {
            boolean z = false;
            if (TextUtils.isEmpty(this.a) && TextUtils.isEmpty(null)) {
                z = true;
            }
            amqw.b(z);
        }
        if (!TextUtils.isEmpty(this.a) || !TextUtils.isEmpty(null)) {
            amqw.b(TextUtils.isEmpty(this.b));
        }
    }

    public final /* synthetic */ anzd c() {
        atkn atkn = (atkn) atko.f.createBuilder();
        String b = aali.b(this.a);
        atkn.copyOnWrite();
        atko atko = (atko) atkn.instance;
        if (b != null) {
            atko.a |= 4;
            atko.d = b;
            b = aali.b(null);
            atkn.copyOnWrite();
            atko = (atko) atkn.instance;
            if (b != null) {
                atko.a |= 16;
                atko.e = b;
                b = aali.b(this.b);
                atkn.copyOnWrite();
                atko = (atko) atkn.instance;
                if (b != null) {
                    atko.a |= 2;
                    atko.c = b;
                    return atkn;
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}
