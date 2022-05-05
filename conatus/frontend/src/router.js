
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import ChattingManager from "./components/ChattingManager"

import LectureManager from "./components/LectureManager"

import GroupManager from "./components/GroupManager"

import AuthUserInfoManager from "./components/AuthUserInfoManager"

import RecommendUserInfoManager from "./components/RecommendUserInfoManager"

import HobbyInfoManager from "./components/HobbyInfoManager"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/chattings',
                name: 'ChattingManager',
                component: ChattingManager
            },

            {
                path: '/lectures',
                name: 'LectureManager',
                component: LectureManager
            },

            {
                path: '/groups',
                name: 'GroupManager',
                component: GroupManager
            },

            {
                path: '/authUserInfos',
                name: 'AuthUserInfoManager',
                component: AuthUserInfoManager
            },

            {
                path: '/recommendUserInfos',
                name: 'RecommendUserInfoManager',
                component: RecommendUserInfoManager
            },

            {
                path: '/hobbyInfos',
                name: 'HobbyInfoManager',
                component: HobbyInfoManager
            },



    ]
})
