package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.youtube.R;

/* renamed from: sby */
final class sby implements OnClickListener {
    private final /* synthetic */ sbz a;

    sby(sbz sbz) {
        this.a = sbz;
    }

    public final void onClick(View view) {
        try {
            this.a.j.e();
        } catch (sbv e) {
            sdf.a(sbz.g, "Failed to toggle playback due to temporary network issue", e);
            sdh.a(this.a, (int) R.string.ccl_failed_no_connection_trans);
        } catch (sbt e2) {
            sdf.a(sbz.g, "Failed to toggle playback due to network issues", e2);
            sdh.a(this.a, (int) R.string.ccl_failed_no_connection);
        } catch (Exception e3) {
            sdf.a(sbz.g, "Failed to toggle playback due to other issues", e3);
            sdh.a(this.a, (int) R.string.ccl_failed_perform_action);
        }
    }
}
