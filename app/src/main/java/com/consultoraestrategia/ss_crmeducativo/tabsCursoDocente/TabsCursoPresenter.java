package com.consultoraestrategia.ss_crmeducativo.tabsCursoDocente;

import com.consultoraestrategia.ss_crmeducativo.tabsCursoDocente.events.TabsCursoEvent;

/**
 * Created by irvinmarin on 27/02/2017.
 */

public interface TabsCursoPresenter {

  void onCreate();
  void onDestroy();
  void OnEventMainThread(TabsCursoEvent event);
}
