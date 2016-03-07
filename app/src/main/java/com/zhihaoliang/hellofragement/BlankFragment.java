package com.zhihaoliang.hellofragement;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link BlankFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link BlankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";

    // TODO: Rename and change types of parameters
    private String mParam1;

    private OnFragmentInteractionListener mListener;

    private View mRootView;

    public BlankFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BlankFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BlankFragment newInstance(String param1, String param2) {
        BlankFragment fragment = new BlankFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        Log.e("=====","setUserVisibleHint :"+mParam1 +" : "+isVisibleToUser);
        super.setUserVisibleHint(isVisibleToUser);
    }

    @Override
    public void onDetach() {
        Log.e("=====","onDetach :"+mParam1);
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
        Log.e("=====","onCreate :"+mParam1);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.e("=====", "onCreateView :" + mParam1);

        mRootView =  inflater.inflate(R.layout.fragment_blank, container, false);
        TextView textView = (TextView) mRootView.findViewById(R.id.text);
        textView.setText(mParam1);
        return  mRootView;

    }

    @Override
    public void onStart() {
        Log.e("=====","onStart :"+mParam1);
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.e("=====","onResume :"+mParam1);
        super.onResume();
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed() {
        Log.e("=====","onButtonPressed :"+mParam1);
        if (mListener != null) {
            mListener.onFragmentInteraction();
        }
    }

    @Override
    public void onPause() {
        Log.e("=====","onPause :"+mParam1);
        super.onPause();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        Log.e("=====","onSaveInstanceState :"+mParam1);
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onStop() {
        Log.e("=====","onStop :"+mParam1 +" : "+mRootView.getX());
        super.onStop();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Log.e("=====","onViewCreated :"+mParam1);
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        Log.e("=====","onHiddenChanged :"+mParam1);
        super.onHiddenChanged(hidden);
    }



    @Override
    public void onDestroyView() {
        Log.e("=====","onDestroyView :"+mParam1);
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.e("=====","onDestroy :"+mParam1);
        super.onDestroy();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }



    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction();
    }
}
