package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.google.android.libraries.youtube.player.playability.AgeVerificationDialog;

/* renamed from: aiul */
public final class aiul implements OnCancelListener {
    private final /* synthetic */ AgeVerificationDialog a;

    public aiul(AgeVerificationDialog ageVerificationDialog) {
        this.a = ageVerificationDialog;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.a.c();
    }
}
