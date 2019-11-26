package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISurveyOverlayService;

/* renamed from: nfm */
final class nfm implements vwv {
    public ISurveyOverlayService a;

    public nfm(ISurveyOverlayService iSurveyOverlayService) {
        this.a = (ISurveyOverlayService) amqw.a((Object) iSurveyOverlayService, (Object) "service cannot be null");
    }

    public final void a(int i, int i2) {
        ISurveyOverlayService iSurveyOverlayService = this.a;
        if (iSurveyOverlayService != null) {
            try {
                iSurveyOverlayService.a(i, i2);
            } catch (RemoteException e) {
                String valueOf = String.valueOf(e);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 40);
                stringBuilder.append("survey call to onClickSkipButton failed ");
                stringBuilder.append(valueOf);
                xtl.d(stringBuilder.toString());
            }
        }
    }

    public final void a(int[] iArr) {
        ISurveyOverlayService iSurveyOverlayService = this.a;
        if (iSurveyOverlayService != null) {
            try {
                iSurveyOverlayService.a(iArr);
            } catch (RemoteException e) {
                String valueOf = String.valueOf(e);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 31);
                stringBuilder.append("survey call to onAnswer failed ");
                stringBuilder.append(valueOf);
                xtl.d(stringBuilder.toString());
            }
        }
    }

    public final void a(Bundle bundle) {
        ISurveyOverlayService iSurveyOverlayService = this.a;
        if (iSurveyOverlayService != null) {
            try {
                iSurveyOverlayService.a(bundle);
            } catch (RemoteException e) {
                String valueOf = String.valueOf(e);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 41);
                stringBuilder.append("survey call to onAdChoicesClicked failed ");
                stringBuilder.append(valueOf);
                xtl.d(stringBuilder.toString());
            }
        }
    }
}
