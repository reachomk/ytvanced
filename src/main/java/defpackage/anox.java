package defpackage;

import android.os.Bundle;

/* renamed from: anox */
abstract class anox {
    public final int a;
    public final ryl b = new ryl();
    public final int c;
    public final Bundle d;

    anox(int i, int i2, Bundle bundle) {
        this.a = i;
        this.c = i2;
        this.d = bundle;
    }

    public abstract void a(Bundle bundle);

    public abstract boolean a();

    /* Access modifiers changed, original: final */
    public final void a(Object obj) {
        this.b.a(obj);
    }

    /* Access modifiers changed, original: final */
    public final void a(anpa anpa) {
        this.b.a((Exception) anpa);
    }

    public final String toString() {
        int i = this.c;
        int i2 = this.a;
        boolean a = a();
        StringBuilder stringBuilder = new StringBuilder(55);
        stringBuilder.append("Request { what=");
        stringBuilder.append(i);
        stringBuilder.append(" id=");
        stringBuilder.append(i2);
        stringBuilder.append(" oneWay=");
        stringBuilder.append(a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
