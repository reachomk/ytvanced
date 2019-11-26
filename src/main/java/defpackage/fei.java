package defpackage;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.text.SpannableStringBuilder;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand;
import java.util.Map;

/* renamed from: fei */
public final class fei implements aaap {
    public final fcb a;
    private final Context b;
    private final fek c;

    public fei(Context context, fcb fcb, fek fek) {
        this.b = context;
        this.a = fcb;
        this.c = fek;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.showSystemInfoDialogCommand);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand showSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand = (ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand) b;
        aybc aybc = (aybc) xsb.a(map, (Object) "ShowSystemInfoDialogCommandResolver.SHOW_SYSTEM_INFO_DIALOG_COMMAND_ORIGIN_SURVEY_KEY", aybc.class);
        if (aybc != null) {
            arml arml;
            this.a.b(aybc);
            Builder builder = new Builder(this.b);
            if ((showSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.a & 1) != 0) {
                arml = showSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.b;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            Builder title = builder.setTitle(ajqy.a(arml));
            fek fek = this.c;
            title.setMessage(new SpannableStringBuilder().append(fek.b(R.string.hats_free_text_system_info_overview)).append(fek.a(R.string.hats_free_text_installed_by_section_header)).append(fek.b(R.string.hats_free_text_installed_by_section_contents)).append(fek.a(R.string.hats_free_text_system_section_header)).append(fek.b(R.string.hats_free_text_system_section_contents)).append(fek.a(R.string.hats_free_text_network_section_header)).append(fek.b(R.string.hats_free_text_network_section_contents))).setOnCancelListener(new feh(this, aybc)).create().show();
        }
    }
}
