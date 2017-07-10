package com.consultoraestrategia.ss_crmeducativo.asistencia;

import android.support.design.widget.FloatingActionButton;

import com.consultoraestrategia.ss_crmeducativo.asistencia.events.AsistenciaEvent;

/**
 * Created by kelvi on 20/02/2017.
 */

public interface AsistenciaPresenter {

    void onCreate();

    void onDestroy();

    void onGetListaAlumnos();

    void initListView();

    void changeStateFabButtons(FloatingActionButton btnCurrentState, FloatingActionButton btnAsistio, FloatingActionButton btnFalto, FloatingActionButton btnJustificado);


    void OnEventMainThread(AsistenciaEvent event);


}
