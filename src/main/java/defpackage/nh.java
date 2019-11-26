package defpackage;

import android.view.View;

/* renamed from: nh */
final class nh extends np {
    private final /* synthetic */ nf a;

    nh(nf nfVar) {
        this.a = nfVar;
    }

    public final View a(int i) {
        View view = this.a.K;
        if (view != null) {
            return view.findViewById(i);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" does not have a view");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final boolean a() {
        return this.a.K != null;
    }
}
