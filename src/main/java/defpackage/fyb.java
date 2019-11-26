package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.protos.youtube.api.innertube.ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand;
import java.util.Map;

/* renamed from: fyb */
public final class fyb implements aaap {
    private final nn a;
    private final aizy b;
    private final Handler c = new Handler(Looper.getMainLooper());

    public fyb(nn nnVar, aizy aizy) {
        this.a = nnVar;
        this.b = aizy;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.showWebViewDialogCommand);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            Handler handler = this.c;
            aizy aizy = this.b;
            aizy.getClass();
            handler.post(new fye(aizy));
            Bundle bundle = new Bundle();
            wtl wtl = new wtl();
            bundle.putByteArray("show_webview_dialog_command", apxu.toByteArray());
            wtl.f(bundle);
            wtl.a(this.a.f(), "web_view_dialog");
        }
    }
}
