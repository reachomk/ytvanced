package com.google.android.libraries.youtube.offline.developer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.youtube.R;
import defpackage.agjc;

public class DebugOfflineActivity extends Activity {
    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        finish();
        super.onCreate(bundle);
        setContentView(R.layout.debug_offline_layout);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.debug_offline_view);
        a(linearLayout, DebugOfflineResyncActivity.class, "Debug Offline Refresh");
        a(linearLayout, DebugOfflineAdActivity.class, "Debug Offline Ads");
        a(linearLayout, DebugOfflineDatabaseActivity.class, "Debug Offline Database");
        a(linearLayout, DebugOfflinePlaylistAutoSyncActivity.class, "Debug Playlist Autosync");
        a(linearLayout, DebugOfflineAutoOfflineActivity.class, "Debug Auto Offline");
        a(linearLayout, DebugOfflineVideosActivity.class, "Debug Offline Videos");
        a(linearLayout, DebugOfflineStreamsActivity.class, "Debug Offline Streams");
        a(linearLayout, DebugOfflineStoreActivity.class, "Debug Offline Store");
        a(linearLayout, DebugOfflineStartupLatencyActivity.class, "Debug Offline Startup Latency");
    }

    private final void a(LinearLayout linearLayout, Class cls, String str) {
        Button button = new Button(this);
        button.setText(str);
        button.setOnClickListener(new agjc(this, cls));
        linearLayout.addView(button);
    }
}
