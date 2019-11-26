package defpackage;

import android.os.Bundle;

/* renamed from: bcn */
final class bcn extends bbg {
    private final /* synthetic */ bco a;

    bcn(bco bco) {
        this.a = bco;
    }

    public final void a(Bundle bundle) {
        this.a.e = bundle.getString("groupableTitle");
        this.a.f = bundle.getString("transferableTitle");
    }

    public final void a(String str, Bundle bundle) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Error: ");
        stringBuilder.append(str);
        stringBuilder.append(", data: ");
        stringBuilder.append(bundle);
        stringBuilder.toString();
    }
}
