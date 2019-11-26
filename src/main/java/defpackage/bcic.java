package defpackage;

import android.util.Printer;
import org.chromium.base.EarlyTraceEvent;
import org.chromium.base.TraceEvent;

/* renamed from: bcic */
public class bcic implements Printer {
    private String a;

    private bcic() {
    }

    public final void println(String str) {
        if (str.startsWith(">")) {
            a(str);
        } else {
            b(str);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void a(String str) {
        boolean a = EarlyTraceEvent.a();
        if (TraceEvent.a || a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Looper.dispatch: ");
            int indexOf = str.indexOf(40, 18);
            int indexOf2 = indexOf != -1 ? str.indexOf(41, indexOf) : -1;
            String str2 = "";
            stringBuilder.append(indexOf2 != -1 ? str.substring(indexOf + 1, indexOf2) : str2);
            stringBuilder.append("(");
            indexOf = str.indexOf(125, 18);
            int indexOf3 = indexOf != -1 ? str.indexOf(58, indexOf) : -1;
            if (indexOf3 == -1) {
                indexOf3 = str.length();
            }
            if (indexOf != -1) {
                str2 = str.substring(indexOf + 2, indexOf3);
            }
            stringBuilder.append(str2);
            stringBuilder.append(")");
            this.a = stringBuilder.toString();
            if (TraceEvent.a) {
                TraceEvent.nativeBeginToplevel(this.a);
            } else {
                EarlyTraceEvent.a(this.a);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void b(String str) {
        boolean a = EarlyTraceEvent.a();
        if ((TraceEvent.a || a) && this.a != null) {
            if (TraceEvent.a) {
                TraceEvent.nativeEndToplevel(this.a);
            } else {
                EarlyTraceEvent.b(this.a);
            }
        }
        this.a = null;
    }

    /* synthetic */ bcic(byte b) {
    }
}
