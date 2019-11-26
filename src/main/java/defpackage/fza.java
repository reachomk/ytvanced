package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.io.File;

/* renamed from: fza */
final /* synthetic */ class fza implements OnClickListener {
    private final fyy a;

    fza(fyy fyy) {
        this.a = fyy;
    }

    public final void onClick(View view) {
        fyy fyy = this.a;
        File file = new File(fyy.c, "Camera");
        file.mkdirs();
        if (file.isDirectory() && file.canWrite()) {
            fyy.c();
            fyy.f = fyy.a(file);
            xan.a(fyy.f, fyy.b, fzc.a, new fzb(fyy));
            return;
        }
        xtl.c("Camera roll directory not accessible.");
    }
}
