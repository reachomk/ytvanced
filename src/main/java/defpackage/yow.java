package defpackage;

import android.widget.Toast;
import com.google.android.youtube.R;

/* renamed from: yow */
final /* synthetic */ class yow implements ywd {
    private final yor a;

    yow(yor yor) {
        this.a = yor;
    }

    public final void a(boolean z, bqn bqn) {
        yor yor = this.a;
        String str = !z ? "Unhearting" : "Hearting";
        String valueOf = String.valueOf(bqn);
        StringBuilder stringBuilder = new StringBuilder((str.length() + 9) + valueOf.length());
        stringBuilder.append(str);
        stringBuilder.append(" failed: ");
        stringBuilder.append(valueOf);
        xtl.c(stringBuilder.toString());
        Toast.makeText(yor.e_, !z ? R.string.unhearting_failed : R.string.hearting_failed, 0).show();
    }
}
