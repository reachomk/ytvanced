package defpackage;

import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.io.File;

/* renamed from: tkm */
final class tkm extends tki {
    public tkm(String str) {
        super(str);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(thu thu, File file) {
        GoogleHelp googleHelp = this.a;
        qdx qdx = ((tie) thu).a;
        if (qdx != null) {
            googleHelp.j = qdx.p;
        }
        googleHelp.d = new ErrorReport(qdx, file);
        googleHelp.d.a = "GoogleHelp";
    }
}
