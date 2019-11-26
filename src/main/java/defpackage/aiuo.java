package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.youtube.player.playability.AgeVerificationDialog;

/* renamed from: aiuo */
public final class aiuo implements OnClickListener {
    private final /* synthetic */ AgeVerificationDialog a;

    public aiuo(AgeVerificationDialog ageVerificationDialog) {
        this.a = ageVerificationDialog;
    }

    public final void onClick(View view) {
        this.a.c();
    }
}
