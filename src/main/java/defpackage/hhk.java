package defpackage;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.ListView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: hhk */
public final class hhk implements ahcf, ahcp {
    private AlertDialog A;
    private AlertDialog B;
    private AlertDialog C;
    private AlertDialog D;
    private AlertDialog E;
    public final Context a;
    public final agvs b;
    public final SharedPreferences c;
    public AlertDialog d;
    public AlertDialog e;
    public CheckBox f;
    public ahcl g;
    public ahcw h;
    public ahcr i;
    public ahcr j;
    public ahcr k;
    public ahcs l;
    public ahct m;
    public ahcu n;
    public ahct o;
    public ahcr p;
    private final ahci q;
    private final aaas r;
    private final bcaa s;
    private final bcaa t;
    private View u;
    private ListView v;
    private OnClickListener w;
    private AlertDialog x;
    private AlertDialog y;
    private AlertDialog z;

    public hhk(Context context, ahci ahci, agvs agvs, aaas aaas, SharedPreferences sharedPreferences, bcaa bcaa, bcaa bcaa2) {
        this.a = context;
        this.q = ahci;
        this.b = agvs;
        this.r = aaas;
        this.c = sharedPreferences;
        this.s = bcaa;
        this.t = bcaa2;
    }

    public final void a(int i, List list) {
        if (this.e == null) {
            LayoutInflater from = LayoutInflater.from(this.a);
            View inflate = from.inflate(R.layout.offline_stream_selection_dialog, null, false);
            this.v = (ListView) inflate.findViewById(R.id.offline_stream_selection_list);
            View inflate2 = from.inflate(R.layout.offline_stream_selection_footer, this.v, false);
            this.v.addFooterView(inflate2);
            this.g = new ahcl(this.a, this.v);
            this.v.setAdapter(this.g);
            this.u = inflate2.findViewById(R.id.offline_stream_selection_group_bottom_separator);
            this.f = (CheckBox) inflate2.findViewById(R.id.remember_stream_setting);
            this.e = new Builder(this.a).setPositiveButton(R.string.ok, null).setNegativeButton(R.string.cancel, null).setView(inflate).create();
        }
        if (!list.isEmpty()) {
            this.g.a(list);
        }
        this.f.setVisibility(0);
        this.u.setVisibility(0);
        this.e.setTitle(i);
        this.g.a(((agqa) list.get(0)).e);
        this.f.setChecked(this.c.getBoolean(ebn.OFFLINE_STREAM_SELECTION_DIALOG_REMEMBER_SETTING_CHECKED, true));
    }

    public final void a(avsj avsj) {
        this.e.show();
        this.w = new hht(this);
        this.e.getButton(-1).setOnClickListener(this.w);
        aabd.a(this.r, avsj.f, (Object) avsj);
    }

    public final void a(String str, avsj avsj, acvx acvx, ahcw ahcw) {
        amqw.a((Object) avsj);
        a(str, avsj, acvx, ahcw, (int) R.string.add_video_to_offline);
    }

    public final void a(avsj avsj, acvx acvx, ahcw ahcw) {
        amqw.a((Object) avsj);
        a(null, avsj, acvx, ahcw, (int) R.string.add_playlist_to_offline);
    }

    private final void a(String str, avsj avsj, acvx acvx, ahcw ahcw, int i) {
        this.h = (ahcw) amqw.a((Object) ahcw);
        ahci ahci = this.q;
        Map a = agqa.a(avsj);
        amul e = ahci.a.e();
        List arrayList = new ArrayList();
        for (avsi avsi : a.keySet()) {
            if (e.contains(avsi)) {
                arrayList.add((agqa) a.get(avsi));
            }
        }
        Collections.sort(arrayList, ahci.a.b());
        boolean a2 = this.b.a();
        if (!arrayList.isEmpty()) {
            if (str != null && a2) {
                agqy a3 = ((agwc) this.s.get()).b().k().a(str);
                if (a3 == null || !a3.i() || ((xhv) this.t.get()).c()) {
                    ahci ahci2 = this.q;
                    Context context = this.a;
                    hhs hhs = new hhs(this, i, avsj, acvx, arrayList);
                    xak.a();
                    ProgressDialog progressDialog = new ProgressDialog(context);
                    progressDialog.setMessage(context.getString(R.string.offline_stream_selection_waiting));
                    progressDialog.setCancelable(false);
                    progressDialog.setIndeterminate(true);
                    progressDialog.show();
                    Collections.sort(arrayList, agqa.c);
                    new ahch(ahci2, context, progressDialog, hhs, new ahcj(avsj.g.d(), str, arrayList)).execute(new ahcj[]{r6});
                    return;
                }
                a(i, arrayList);
                a(avsj);
                hhk.a(avsj, acvx);
                return;
            }
            a(i, arrayList);
            a(avsj);
            hhk.a(avsj, acvx);
        }
    }

    public static void a(avsj avsj, acvx acvx) {
        if (acvx != null) {
            acvx.a(avsj.g.d(), null);
        }
    }

    public final void a(ahcr ahcr) {
        this.p = ahcr;
        if (this.E == null) {
            this.E = a(Integer.valueOf(R.string.offline_dialog_title_expired), Integer.valueOf(R.string.offline_dialog_message_expired), new hhv(this), Integer.valueOf(R.string.cancel), Integer.valueOf(R.string.offline_expiration_dialog_renew_button));
        }
        this.E.show();
    }

    public final void b(ahcr ahcr) {
        this.j = ahcr;
        if (this.x == null) {
            this.x = a(Integer.valueOf(R.string.remove_offline_video_title), Integer.valueOf(R.string.remove_offline_video_message), new hhu(this), Integer.valueOf(R.string.cancel), Integer.valueOf(R.string.remove_offline_confirmed_button));
        }
        this.x.show();
    }

    public final void c(ahcr ahcr) {
        this.i = ahcr;
        if (this.z == null) {
            this.z = a(Integer.valueOf(R.string.stop_offline_video_title), Integer.valueOf(R.string.stop_offline_video_message), new hhx(this), Integer.valueOf(R.string.stop_offline_dismiss_button), Integer.valueOf(R.string.stop_offline_confirmed_button));
        }
        this.z.show();
    }

    public final void a(ahcs ahcs) {
        if (this.A == null) {
            this.A = a(new hib[]{new hib(R.string.approve_playlist_sync, R.drawable.ic_offline_dialog_sync)}, new hhw(this));
        }
        this.l = ahcs;
        this.A.show();
    }

    public final void a(ahct ahct) {
        if (this.B == null) {
            this.B = new Builder(this.a).setTitle(R.string.readd_to_offline_video).setNegativeButton(R.string.cancel, null).setPositiveButton(R.string.readd_offline, new hhz(this)).create();
        }
        this.m = ahct;
        this.B.show();
    }

    public final void b(ahct ahct) {
        amqw.a((Object) ahct);
        new Builder(this.a).setMessage(R.string.offline_retry_failed_videos_dialog_message).setNegativeButton(R.string.cancel, null).setPositiveButton(R.string.ok, new hhy(ahct)).show();
    }

    public final void c(ahct ahct) {
        if (this.D == null) {
            this.D = new Builder(this.a).setTitle(R.string.readd_to_offline_video).setMessage(R.string.offline_file_not_found_dialog_message).setNegativeButton(R.string.cancel, null).setPositiveButton(R.string.save_offline, new hhm(this)).create();
        }
        this.o = ahct;
        this.D.show();
    }

    public final void d(ahcr ahcr) {
        this.k = ahcr;
        if (this.y == null) {
            this.y = a(Integer.valueOf(R.string.remove_offline_playlists_title), Integer.valueOf(R.string.remove_offline_playlists_message), new hhp(this), Integer.valueOf(R.string.cancel), Integer.valueOf(R.string.remove_offline_confirmed_button));
        }
        this.y.show();
    }

    public final void e(ahcr ahcr) {
        d(ahcr);
    }

    public final void a(ahcu ahcu) {
        if (this.C == null) {
            this.C = a(new hib[]{new hib(R.string.sync_offline_playlist_action, R.drawable.ic_offline_dialog_sync), new hib(R.string.remove_offline_playlist_action, R.drawable.ic_offline_dialog_remove)}, new hho(this));
        }
        this.n = ahcu;
        this.C.show();
    }

    public final void f(ahcr ahcr) {
        if (this.b.i()) {
            if (this.d == null) {
                this.d = new Builder(this.a).setPositiveButton(R.string.ok, null).setNegativeButton(R.string.cancel, null).setTitle(R.string.unknown_playlist_size_warning_title).setMessage(R.string.unknown_playlist_size_warning_message).setView(LayoutInflater.from(this.a).inflate(R.layout.offline_playlist_warning_dialog, null, false)).create();
            }
            this.d.show();
            CheckBox checkBox = (CheckBox) this.d.findViewById(R.id.do_not_show_offline_playlist_warning_checkbox);
            checkBox.setChecked(false);
            this.d.getButton(-1).setOnClickListener(new hhn(this, checkBox, ahcr));
            return;
        }
        ahcr.a();
    }

    private final AlertDialog a(Integer num, Integer num2, ahcr ahcr, Integer num3, Integer num4) {
        Builder positiveButton = new Builder(this.a).setTitle(num.intValue()).setMessage(num2.intValue()).setCancelable(true).setPositiveButton(num4.intValue(), new hhr(ahcr));
        positiveButton.setNegativeButton(num3.intValue(), null);
        return positiveButton.create();
    }

    private final AlertDialog a(hib[] hibArr, DialogInterface.OnClickListener onClickListener) {
        return new Builder(this.a).setTitle(R.string.offline_fragment_title).setCancelable(true).setAdapter(new hhq(this, this.a, hibArr, hibArr), onClickListener).create();
    }
}
