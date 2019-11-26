package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: gao */
public final class gao implements Runnable {
    public azem a;
    private final Activity b;

    public gao(Activity activity) {
        this.b = activity;
    }

    public final void run() {
        String str = "MTDIALOG";
        if (this.b.getFragmentManager().findFragmentByTag(str) == null) {
            azem azem = this.a;
            gan gan = new gan();
            Bundle bundle = new Bundle();
            bundle.putByteArray("VIDEOMODEL", azem.toByteArray());
            gan.setArguments(bundle);
            gan.show(this.b.getFragmentManager(), str);
        }
    }
}
