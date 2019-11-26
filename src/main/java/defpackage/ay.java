package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/* renamed from: ay */
public final class ay extends Fragment {
    public ax a;

    public static void a(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        String str = "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag";
        if (fragmentManager.findFragmentByTag(str) == null) {
            fragmentManager.beginTransaction().add(new ay(), str).commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ax axVar = this.a;
        if (axVar != null) {
            axVar.a();
        }
        a(aa.ON_CREATE);
    }

    public final void onStart() {
        super.onStart();
        ax axVar = this.a;
        if (axVar != null) {
            axVar.b();
        }
        a(aa.ON_START);
    }

    public final void onResume() {
        super.onResume();
        ax axVar = this.a;
        if (axVar != null) {
            axVar.c();
        }
        a(aa.ON_RESUME);
    }

    public final void onPause() {
        super.onPause();
        a(aa.ON_PAUSE);
    }

    public final void onStop() {
        super.onStop();
        a(aa.ON_STOP);
    }

    public final void onDestroy() {
        super.onDestroy();
        a(aa.ON_DESTROY);
        this.a = null;
    }

    private final void a(aa aaVar) {
        Activity activity = getActivity();
        if (activity instanceof ak) {
            ((ak) activity).a().a(aaVar);
            return;
        }
        if (activity instanceof af) {
            x y_ = ((af) activity).y_();
            if (y_ instanceof ai) {
                ((ai) y_).a(aaVar);
            }
        }
    }
}
