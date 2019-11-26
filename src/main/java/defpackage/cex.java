package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* renamed from: cex */
public final class cex extends Fragment {
    public final cel a;
    public final cfe b = new cfa(this);
    public brl c;
    private final Set d = new HashSet();
    private cex e;

    public cex() {
        cel cel = new cel();
        this.a = cel;
    }

    private final void a() {
        cex cex = this.e;
        if (cex != null) {
            cex.d.remove(this);
            this.e = null;
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a();
            this.e = bqy.a((Context) activity).e.a(activity.getFragmentManager(), cez.a(activity));
            if (!equals(this.e)) {
                this.e.d.add(this);
            }
        } catch (IllegalStateException e) {
            String str = "RMFragment";
            if (Log.isLoggable(str, 5)) {
                Log.w(str, "Unable to register fragment with root", e);
            }
        }
    }

    public final void onDetach() {
        super.onDetach();
        a();
    }

    public final void onStart() {
        super.onStart();
        this.a.a();
    }

    public final void onStop() {
        super.onStop();
        this.a.b();
    }

    public final void onDestroy() {
        super.onDestroy();
        this.a.c();
        a();
    }

    public final String toString() {
        String fragment = super.toString();
        Object parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = null;
        }
        String valueOf = String.valueOf(parentFragment);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(fragment).length() + 9) + valueOf.length());
        stringBuilder.append(fragment);
        stringBuilder.append("{parent=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
