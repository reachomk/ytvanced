package defpackage;

import android.graphics.Matrix;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.livecreation.ui.view.CropView;
import com.google.android.youtube.R;
import java.io.FileNotFoundException;

/* renamed from: acmj */
public final class acmj extends nf {
    public acmm a;
    public CropView b;
    private boolean c;

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        View inflate = p().getLayoutInflater().inflate(R.layout.lc_crop_thumbnail_fragment, viewGroup, false);
        this.b = (CropView) inflate.findViewById(R.id.lc_crop_view);
        CropView cropView = this.b;
        Uri uri = (Uri) this.j.getParcelable("ARG_INPUT_IMAGE");
        cropView.a = uri;
        try {
            cropView.f = akkv.a(cropView.getContext().getContentResolver(), uri);
            if (((Integer) cropView.f.first).intValue() >= cropView.d && ((Integer) cropView.f.second).intValue() >= cropView.e) {
                i = akkv.b(cropView.getContext().getContentResolver(), uri);
                cropView.g = i.getWidth();
                cropView.h = i.getHeight();
                cropView.j.setImageBitmap(i);
                cropView.i = new Matrix();
                cropView.requestLayout();
                i = 1;
            }
        } catch (FileNotFoundException unused) {
        }
        this.c = i ^ 1;
        return inflate;
    }

    public final void B() {
        super.B();
        if (this.c) {
            acmm acmm = this.a;
            if (acmm != null) {
                acmm.a();
            }
        }
    }
}
