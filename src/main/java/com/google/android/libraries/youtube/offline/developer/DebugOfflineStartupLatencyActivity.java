package com.google.android.libraries.youtube.offline.developer;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.afpu;
import defpackage.agjb;
import defpackage.agki;
import defpackage.agkj;
import defpackage.agvz;
import defpackage.agwc;
import defpackage.bcaa;
import defpackage.xfc;

public class DebugOfflineStartupLatencyActivity extends Activity {
    public afpu a;
    public bcaa b;
    public TextView c;
    public agvz d;
    public final String[] e = new String[]{"--OKrYxOb6Y", "-0zoWMSEOGg", "-Eny7zAB9VM", "-q1gOyw3qIE", "0MNzW0dIbh0", "0hGFFXOQkdM", "0xzN6FM5x_E", "1HQEexyooiM", "1IW3y3x6o_g", "1J0C2HlC38c", "265ajfpvPOY", "2Ra_CmSNeDU", "2V6NHKmfnW0", "2ZGZlOnIOJo", "31uATZkJBKo", "3BJU2drrtCM", "3InpjMHE0gI", "3Na4srNQXd0", "3cF10UIs1ZA", "4-1IaK9SNqg", "4XDq4kyCmdA", "4juJXyLX510", "5-hwCZMSpug", "5hRJybAJ1qo", "62CQyBD8-10", "69I-x5yIem0", "6E5UEdh2g-0", "6GDsgWbNeK8", "6Kby6wuy_bE", "6N5l0sgPP5k", "6SIlYiiCGLI", "6U4X2mIFVNc", "6fjBRG6UCjk", "6n95QvoM2DA", "70H6fKv_6qI", "78-1MlkxyqI", "7DbslbKsQSk", "7S1unD-grZo", "7SaCb2xoTwA", "7eXVVv4M38c", "84WIaK3bl_s", "8Dn7yFgneMo", "8c5YY9DcoiE", "91BUM3WhCfo", "97Gh93Daio0", "98DXe3uKwfc", "9BKC0T1oXGU", "AHrCI9eSJGQ", "ASITZ2KyYww", "AaFdCvnV8PM", "ApGXujZVWf4", "BMZP4CtphaU", "Bgo_1OtePfQ", "BxxFNkNf6q8", "By3HD-R3808", "C7wzPb_ldKU", "CEHMfdqwWXA", "CKBnkchY8Zk", "Cbtkoo3zAyI", "CeuOLUkUpAw", "DOp6BCFw4QM", "DS_1vjOeEq4", "DkW87-Z9FAY", "Dr7dpEDNNC4", "DtlVfPMXvxo", "DxLBT-1Dt30", "ECcH1_cdHZQ", "EDgg72ic-CE", "ERNr-qIDXTk", "Ejou8aa5eZk", "Er6QUQZbv0w", "F-jwrpXPBp0", "FgLAXIHQwWw", "G8OsHB_tITs", "GDnOWmnA8BY", "GK0aL4E4bWs", "GaIN_FSfPw0", "GcKkiRl9_qE", "Gq8Mqf7hLjM", "GyvY3YRGFwM", "H6AO-RhaG_4", "HIGtLRnGCD4", "HSqPrtE374Q", "HoZrLFs_ow8", "I1Kp7ddK-VY", "IVsWTkD2M6Q", "IYgMEMdGkF8", "ImK7w8lmDhY", "J37evpYs28M", "J6pbiOe7buY", "JFita8Kb4Yo", "JKdurugtJJw", "JM1HuI0UMVA", "J_8mdH20qTQ", "KIvj0F47UtY", "KuG_CeEZV6w", "KwfYNjXkfXE", "LMvZIjgup2s", "LN7yJkYq_aw", "LPcp5q2aqPg", "Li_sFvdyTHU", "Lx9fRu5ehFo", "M16CGK1T9MM", "M1pw5BN0cCY", "MKWVMrj_h-o", "MPwtwE7rx6o", "MTY1Kje0yLg", "MVFkYO4cU5A", "NaVT9BKLUSo", "NgH5MAqOtoo", "NhBzhi9jPFs", "NpSNkn1uQ2I", "O0qT4cK-wtk", "OUWUeYwDYK8", "OUlpqtz1gv4", "OkCflescpjs", "OurY0BY5EFI", "P5R12zxuSvk", "PUIxyLRnzDc", "PUwmA3Q0_OE", "PXL7OHtetLc", "PdCAphwNurM", "PszuBGqLCew", "Pwyz8madq3c", "Q4TfEF7Hgyg", "QLFRGj-PPNI", "RAKZVK5xK6E", "RDAJfR34RtE", "RDpvtdULxq8", "RSnVBQl09OA", "RWWfhzsvetg", "S5XXsRuMPIU", "S7lgSivUcB8", "S8YVlR_1hlo", "SFSMdkM7RuQ", "SOjwjBwfHD0", "SSMPZNOSm8g", "Ss7vB-WI26Y", "TE5RdFFgW0w", "TPa8whN2q60", "TU_oD0CVyCc", "Ucg3_ye_eAg", "Uf1pG8X4irI", "V8-JfSXPDp0", "VYStvnepo40", "VcN-364nmXo", "Vv8pcs0C8bw", "Vw6tjKbD6nY", "VwWV4JelEzY", "W_upHoSzxJg", "Wi7FSwS-Vx0", "WnzlbyTZsQY", "WvMy8tu2NiE", "XE9pUM9MEFA", "XHb7g6yuGgE", "XKFKPQHdWRI", "XQOQI1z6Zyk", "XYviM5xevC8", "XaVftTbBs08", "XpuGgXe76sI", "Y8cztwbz-hc", "YE_6BGUCeb4", "YGq2Hatg9j4", "YNCY8QhagyY", "Yeg1QSlYMcc", "Yl6bw6Dzmnc", "YljcxVH64yo", "YuOBzWF0Aws", "Z0Zf1kEFEbE", "Z6BKRaaSLn0", "Z7AmxZiWA40", "Z9NQatne0xg", "ZiKyW2oFuzs", "_-HCFiA-_LI", "_Efyu8vPqiY", "_K_0k5cs3dE", "_cvJ6tfNG28", "_fdFwocXQzg", "_lx9OtdcfJY", "_odJSkk71vo", "_yC_OBXDDz0", "a_X-ANkaSfo", "ad_higXixRA", "bSHf5R7HRt0", "bZgklu52Rus", "bp_WidtF2zs", "c8W-auqg024", "cDLFrXMvOjs", "cJwWPNPsalk", "cNXD10-r6QE", "csTkMwBE45g", "d8pJkuSp1iI", "dChsc1LUaZ8", "dEOlvTqYUNo", "dGnCTS1gOJA", "dmvZmnMgwT0", "drwIRNRMLMw", "eAWBiKVGIWg", "eIQ5u24LBJc", "ehEuczQUh8E", "fe-xbF1ztXo", "foLlul8Tl3E", "g6_2DwIVm1M", "g8hG7ecQniY", "gLDYtH1RH-U", "gaf8zHp-iaY", "gdGmYDz_d6A", "gjFFEY8hf5w", "gl0zFSxY2hQ", "h5M0Ko0RR38", "hanNlwodYR4", "hb2uQ_Dw00I", "hj1VfnJdRNw", "hmYZ3Q_MpAk", "iR1Ku5dnbH8", "j8qwb6IHrZk", "jNQXAC9IVRw", "jTDFzZmj5IA", "jZftKBNXcoA", "jmZ0fJC5lwQ", "kHl_4yZEo1I", "kRh1zXFKC_o", "k_GM1JA608Y", "kd7KC3PaEaA", "krVA7gMkIxU", "l7BOm1I73yo", "l9o33uBi40U", "lhKZa4SdmZ0", "luMoCA78NBo", "lxvGqDrhQJE", "mGxpw4K5Tq4", "mNfikXxOPHQ", "mhleha-SqCA", "mwoWyPFQlpM", "n0G01BGIf0g", "n1gMfyyW-zI", "nRkwuTOESCc", "o6tDuwd5gzE", "o9ecdMtEX1o", "oGGe3Z6XmCg", "oGRZmZiKL6w", "oPp4htuqDOs", "oY0oDiPYFoM", "oY2nVQNlUB8", "oZhn7EMuyro", "otbEURGxqCY", "p_7Qi3mprKQ", "pcL5u4Oc_yY", "q3UvXWCeguc", "qMFpOcLroOg", "qmfhHssHayU", "r-i6XpcL1Fs", "rH1D_3G56DY", "rZnMlHqRYKs", "rbasThWVb-c", "rjaL94yEJME", "s0-oF-ZvOrI", "sDQW2-kgFPg", "sTcwGOhSsy0", "sYzS4H7e3Bc", "soxxPyaAT1k", "stxS0xgUMuc", "syyimfXVmoY", "teWgdHnVUQs", "tfTyeIO4jZo", "tw25CM1MXlU", "u8T1ChHCbuk", "uAJlg8MDAlU", "uCyIrjjUfc0", "uFJpq8S99bM", "uKXohcwplh0", "uP49ZCEQEFA", "uR9uJG6dwtU", "uSD02UU5I68", "uWVFCIGTRRE", "uZTjLlFt1ZE", "ueQyL3-HqjA", "ugn9YHyvtS8", "uxs1gxDPIAs", "v0NfeDoNjKQ", "vPBM0g9usMs", "vbph9F_pRNI", "vpAw3cVWguU", "w-_QeFKPoc8", "w3Ju1hBNI2Q", "wJdNrCeUdhc", "wRglS2sNuKU", "w_A6aiEOjF8", "wbzD04leeLI", "wsw8EXuefuY", "wx_Zo93RQoo", "x8k1jO9W8sY", "xvPcSJ5iH4Y", "y1auHAjqL6k", "yohYrKCexvM", "yvSmPqqZB3Q", "zBnDWSvaQ1I", "zBnuQxuZRl0", "zDAYZU4A3w0", "zZTQngw8MZE"};
    private Handler f;

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        finish();
        super.onCreate(bundle);
        ((agjb) ((xfc) getApplication()).n()).pm().a(this);
        setContentView(R.layout.debug_offline_startup_latency_layout);
        View findViewById = findViewById(R.id.offline_startup_latency_debug_view);
        TextView textView = (TextView) findViewById(R.id.account_header);
        a(50, R.id.download_50_videos_button);
        a(100, R.id.download_100_videos_button);
        a(150, R.id.download_150_videos_button);
        a(200, R.id.download_200_videos_button);
        a(300, R.id.download_300_videos_button);
        TextView textView2 = (TextView) findViewById(R.id.not_signed_in_error_view);
        if (this.a.a()) {
            CharSequence str;
            String valueOf = String.valueOf(this.a.c().a());
            String str2 = "Signed in as ";
            if (valueOf.length() == 0) {
                str = new String(str2);
            } else {
                str = str2.concat(valueOf);
            }
            textView.setText(str);
            this.d = ((agwc) this.b.get()).b();
        } else {
            findViewById.setVisibility(8);
            textView2.setVisibility(0);
        }
        this.c = (TextView) findViewById(R.id.logs_text_view);
        HandlerThread handlerThread = new HandlerThread("debugOfflineLogs");
        handlerThread.start();
        this.f = new Handler(handlerThread.getLooper(), new agki(this));
    }

    private final void a(int i, int i2) {
        Button button = (Button) findViewById(i2);
        button.setText(getString(R.string.automatically_download_videos, new Object[]{String.valueOf(i)}));
        button.setOnClickListener(new agkj(this, r0, i));
    }

    /* Access modifiers changed, original: protected|final */
    public final void onPause() {
        super.onPause();
        this.f.removeMessages(1);
    }
}
