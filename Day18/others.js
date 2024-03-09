const like=(req,res) =>{
    res.send("like")
}

const comment=(req,res) =>{
    res.send("comment")
}

const unlike=(req,res) =>{
    res.send("unlike")
}
const deletecomment=(req,res) =>{
    res.send("deletecomment")
}
const updatecomment=(req,res) =>{
    res.send("updatecomment")
}
const updatepost=(req,res) =>{
    res.send("updatepost")
}
const searchpost=(req,res) =>{
    res.send("searchpost")
}
const shareuserdata=(req,res) =>{
    res.send("shareuserdata")
}

const createpost=(req,res) =>{
    res.send("createpost")
}

const deletepost=(req,res) =>{
    res.send("deletepost")
}

const modifyuserdata=(req,res) =>{
    res.send("modifyuserdata")
}
const savedpost=(req,res) =>{
    res.send("savedpost")
}

module.exports={like,comment,unlike,deletecomment,updatecomment,createpost,deletepost,updatepost,searchpost,shareuserdata,modifyuserdata,savedpost}